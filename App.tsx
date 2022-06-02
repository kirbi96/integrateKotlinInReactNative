import React, {useState} from 'react';
import {SafeAreaView, StyleSheet, Text, TouchableOpacity} from 'react-native';
import {CustomNativeView} from './src/CustomNativeView';

const App = () => {
  const [show, setShow] = useState(false);

  const pressButton = () => {
    setShow(s => !s);
  };

  return (
    <SafeAreaView style={{flex: 1, padding: 15, backgroundColor: 'white'}}>
      <Text style={styles.title}>React-Native screen</Text>

      <TouchableOpacity onPress={() => pressButton()} style={styles.button}>
        <Text style={styles.buttonText}>
          Touch here if u want visit native screens
        </Text>
      </TouchableOpacity>

      {show && <CustomNativeView />}
    </SafeAreaView>
  );
};

const styles = StyleSheet.create({
  title: {
    marginTop: 32,
    textAlign: 'center',
    fontSize: 32,
    fontWeight: 'bold',
    color: 'black',
  },
  button: {
    marginTop: 64,
    padding: 10,
    backgroundColor: '#644ec7',
    borderRadius: 8,
  },
  buttonText: {
    textAlign: 'center',
    color: 'white',
  },
});

export default App;
