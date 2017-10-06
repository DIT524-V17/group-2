import serial
import math
import matplotlib
matplotlib.use('GTKAgg')
from matplotlib import pyplot as plt
import re

arduino = serial.Serial('/dev/ttyACM0', 9600)

dic_location = {}
dic_distance = {}

#initialize graph
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

#Start mapping on arduino
arduino.write('MM')

#reading from arduino
def read_arduino():
    global lastest_input
    buffer_string = ''
    buffer_string = buffer_string + arduino.read(arduino.inWaiting())
    if '\n' in buffer_string:
        lines = buffer_string.split('\n')
        latest_input = lines[-2]
        buffer_string = lines[-1]
    return latest_input

def sweep():
    arduino.write('SWEEP')
    for i in range(180):
        i += 1
        latest = read_arduino()
        if latest.startswith('LA'):
            latest = latest.replace('LA','')
            angle = float(latest)
        if latest.startswith('LD'):
            latest = latest.replace('LD','')
            distance = float(latest)
        x = (math.cos(math.radians(angle))) * distance
        y = (math.sin(math.radians(angle))) * distance
        dic_location = {x: y}
        dic_distance = {angle: distance}
    i = 0
    for i in range(180):
        i += 1
        latest = read_arduino()
        if latest.startswith('LA'):
            latest = latest.replace('LA','')
            angle = float(latest)
        if latest.startswith('LD'):
            latest = latest.replace('LD','')
            distance = float(latest)
        x = (math.cos(math.radians(angle))) * distance
        y = (math.sin(math.radians(angle))) * distance
        dic_location_2 = {x: y}
        dic_distance_2 = {angle: distance}

    dic_location = average_sweep(dic_location, dic_location_2)
    dic_distance = average_sweep(dic_distance, dic_distance_2)
    turn(dic_location, dic_distance)

def average_sweep(dic, dic_2):
    dic_tog = {'first': dic, 'second': dic_2}
    result = {}
    for _, value in dic_tog.items():
        for key,val in value.items:
            result.setdefault(key, []).append(val)

    return {i:sum(result[i])/len(result[i]) for i in result}

def turn(dic_loc, dic_dist):
    turn_not_complete = true
    object_front = [k for k, v in dic_loc.iteritems() if v == dict[90]]
    if abs(min(object_front) - 90) >= (max(object_front) - 90):
        arduino.write('TA' + min(object_front) + 3)
        arduino.write('DT' + dic_dist[angle])
    elif abs(min(object_front) - 90) < (max(object_front) - 90):
        arduino.write('TA' + max(object_front) + 3)
        arduino.write('DT' + dic_dist[angle])
    
    while(turn_not_complete)
        if read_arduino().startswith('TC'):
            turn_not_complete = false

    sweep()
        
    
    
        
        
    
    
    

