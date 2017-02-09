'use strict';
/**
 * Sample React Native App
 * https://github.com/facebook/react-native
 * @flow
 */

import React, { Component } from 'react';
import {
    AppRegistry,
    Alert,
    StyleSheet,
    Text,
    View,
    TouchableOpacity,
    Image
} from 'react-native';
var MapView = require('react-native-maps');

    const onCarButtonPress = () => {
        //Add functionality for the button here.
        Alert.alert('Acquire car button has been pressed!');
    };
    const onManualButtonPress = () => {
        //Add functionality for the button here.
        Alert.alert('Manual steering button has been pressed!');
    };

export default class androidguard extends Component {
  render() {
    return (
      <View style={styles.container}>
      <MapView
        style={styles.maps}
        mapType = "hybrid"
        region={{
            latitude: 37.78825,
            longitude: -122.4324,
            latitudeDelta: 0.015,
            longitudeDelta: 0.0121,
        }}>

      </MapView>
        <View style={styles.containerOnTop}>
        <Image
          style={{width: 200, height: 200}}
          source={require('./public/images/logo.png')}
          />

          <Text style={styles.welcome}>
            Welcome to G.U.A.R.D!
          </Text>
          <Text style={styles.instructions}>
            To get started, edit index.android.js
          </Text>
          <Text style={styles.instructions}>
            Double tap R on your keyboard to reload,{'\n'}
            Shake or press menu button for dev menu
          </Text>
          </View>
          <TouchableOpacity style={styles.button} onPress={onCarButtonPress}>
            <Text style={styles.welcome}>
                Acquire a Car
            </Text>
          </TouchableOpacity>
          <TouchableOpacity style={styles.button} onPress={onManualButtonPress}>
              <Text style={styles.welcome}>
                  Manual steering
              </Text>
          </TouchableOpacity>
      </View>
    );
  }
}

const styles = StyleSheet.create({
  container: {
    flex: 1,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#F4F4F4',
  },
  containerOnTop: {
    padding: 15,
    justifyContent: 'center',
    alignItems: 'center',
    backgroundColor: '#DCD0C0',
    borderRadius: 10,
  },
  maps: {
   position: 'absolute',
   top: 0,
   left: 0,
   right: 0,
   bottom: 0
 },
  welcome: {
    fontSize: 20,
    textAlign: 'center',
    color: '#373737',
    margin: 10,
  },
  instructions: {
    textAlign: 'center',
    color: '#373737',
    marginBottom: 5,
  },
  button: {
    margin: 15,
    backgroundColor: '#C0B283',
    borderRadius: 10,
  },
});

AppRegistry.registerComponent('androidguard', () => androidguard);
