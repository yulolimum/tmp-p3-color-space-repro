import React from 'react';
import {
  ImageBackground,
  SafeAreaView,
  Text,
  View,
  useWindowDimensions,
} from 'react-native';

function App(): JSX.Element {
  const {height} = useWindowDimensions();

  return (
    <SafeAreaView style={{flex: 1}}>
      <View
        style={{
          backgroundColor: 'black',
          justifyContent: 'center',
          alignItems: 'center',
          height: height / 4,
        }}>
        <ImageBackground
          source={{
            uri: 'https://2.bp.blogspot.com/-LqRniYeVeEk/XOLYEiOcKCI/AAAAAAAAJXI/IAn0yO21XYkwnkUnDlHtdPGI6VyMDEoeACLcBGAs/s1600/android_p3.png',
          }}
          style={{width: height / 4, height: height / 4}}
          resizeMode="contain">
          <Text
            style={{
              color: 'white',
              fontSize: 15,
              fontWeight: '700',
              textAlign: 'center',
            }}>
            This is a wide color gamut image. You should see an Android.
          </Text>
        </ImageBackground>
      </View>

      <View
        style={{
          backgroundColor: 'rgb(255, 0, 0)',
          flex: 1,
          borderWidth: 20,
          borderColor: 'rgb(255, 0, 0)',
        }}
      />

      <View
        style={{
          backgroundColor: 'rgb(0, 255, 0)',
          flex: 1,
          borderWidth: 20,
          borderColor: 'rgb(0, 255, 0)',
        }}
      />

      <View
        style={{
          backgroundColor: 'rgb(0, 0, 255)',
          flex: 1,
          borderWidth: 20,
          borderColor: 'rgb(0, 0, 255)',
        }}
      />
    </SafeAreaView>
  );
}

export default App;
