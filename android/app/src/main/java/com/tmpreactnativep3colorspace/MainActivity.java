package com.tmpreactnativep3colorspace;

import com.facebook.react.ReactActivity;
import com.facebook.react.ReactActivityDelegate;
import com.facebook.react.defaults.DefaultNewArchitectureEntryPoint;
import com.facebook.react.defaults.DefaultReactActivityDelegate;
import android.graphics.ColorSpace;
import android.util.Log;
import android.os.Bundle;
import android.widget.ImageView;

public class MainActivity extends ReactActivity {

  @Override
  protected void onCreate(Bundle savedInstanceState) {
    super.onCreate(savedInstanceState); 

    // Check if the device supports wide color gamut
    boolean isDisplayWideGamutCapable = getWindow().isWideColorGamut();

    // Log the result to Logcat
    Log.d("MainColorGamutCheck", "Is wide color gamut supported? " + isDisplayWideGamutCapable);

     // Get the current color mode of the window
    int colorMode = getWindow().getColorMode();

     // Log the color mode value
    Log.d("MainColorGamutCheck", "Current color mode: " + colorMode);
  }

  /**
   * Returns the name of the main component registered from JavaScript. This is used to schedule
   * rendering of the component.
   */
  @Override
  protected String getMainComponentName() {
    return "TmpReactNativeP3ColorSpace";
  }

  /**
   * Returns the instance of the {@link ReactActivityDelegate}. Here we use a util class {@link
   * DefaultReactActivityDelegate} which allows you to easily enable Fabric and Concurrent React
   * (aka React 18) with two boolean flags.
   */
  @Override
  protected ReactActivityDelegate createReactActivityDelegate() {
    return new DefaultReactActivityDelegate(
        this,
        getMainComponentName(),
        // If you opted-in for the New Architecture, we enable the Fabric Renderer.
        DefaultNewArchitectureEntryPoint.getFabricEnabled());
  }
}
