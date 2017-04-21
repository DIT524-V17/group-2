import socket
import time

serverName = 'localhost'
serverPort = 8888
clientSocket = socket.socket(socket.AF_INET, socket.SOCK_STREAM)
clientSocket.connect((serverName, serverPort))

while 1:
    message = 'P777.777 999.9999' + '\n'
    clientSocket.sendto(message.encode('utf-8'), (serverName, serverPort))
    time.sleep(5)
