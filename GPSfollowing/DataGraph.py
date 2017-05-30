import serial
import math
import matplotlib
matplotlib.use('GTKAgg')
from matplotlib import pyplot as plt
import re

arduino = serial.Serial('/dev/ttyACM0', 9600)

dic = {}

x = 0
y = 0
angle = 45
distance = 5

#iniitalize graph
fig, ax = plt.subplots(1, 1)
ax.set_aspect('equal')
ax.set_xlim(-255, 255)
ax.set_ylim(-255, 255)
ax.hold(True)
plt.frame.Maximize(True)
plt.show(False)
plt.draw()
background = fig.canvas.copy_from_bbox(ax.bbox)
points = ax.plot(x, y, 'o')[0]


#calculate a turn
def turn_calc(dix, dict_dist):
    object_front = [k for k, v in dix.iteritems() if v == dict[45]]
    if abs(min(object_front) - 45) >= (max(object_front) - 45):
        #set turn angle to
        min(object_front) + 3
    elif abs(min(object_front) - 45) < (max(object_front) - 45):
        #set turn angle to
        max(object_front) + 3
        #set distance to travel
        dict_dist[angle]

def get_angle(s):
    s = s.replace('LA','')
    angle = float(s)
    return angle

def get_distance(s):
    s = s.replace('LD','')
    distance = float(s)
    return distance

while True:
    global lastest_input
    buffer_string = ''
    buffer_string = buffer_string + arduino.read(arduino.inWaiting())
    if '\n' in buffer_string:
        lines = buffer_string.split('\n')
        latest_input = lines[-2]
        buffer_string = lines[-1]
    if latest_input.startswith('LA'):
        angle = get_angle(latest_input)
    if latest_input.startswith('LD'):
        distance = get_distance(latest_input)

    #calculate location on graph based on angle and distance fro lidar/servo
    print angle
    x = (math.cos(math.radians(angle))) * distance
    y = float((math.sin(math.radians(float(angle)))) * float(distance))
    dic = {angle: x}
    dic_dist = {angle: distance}

    points.set_data(x, y)
    #fig.canvas.restore_region(background)
    ax.draw_artist(points)
    fig.canvas.blit(ax.bbox)

    #turn_calc(dic, dic_dist)
