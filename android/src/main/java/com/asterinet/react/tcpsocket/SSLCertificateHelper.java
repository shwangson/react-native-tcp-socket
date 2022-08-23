package com.asterinet.react.tcpsocket;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

import com.facebook.react.ReactPackage;
import com.facebook.react.bridge.JavaScriptModule;
import com.facebook.react.bridge.NativeModule;
import com.facebook.react.bridge.ReactApplicationContext;
import com.facebook.react.uimanager.ViewManager;

//import androidx.annotation.NonNull;

@SuppressWarnings("unused")
public class TcpSocketPackage implements ReactPackage {
    @Override
    public List<NativeModule> createNativeModules(ReactApplicationContext reactContext) {
        //noinspection ArraysAsListWithZeroOrOneArgument
        return Arrays.<NativeModule>asList(new TcpSocketModule(reactContext));
    }

    @Override
    public List<Class<? extends JavaScriptModule>> createJSModules() {
        return null;
    }

    @Override
    public List<ViewManager> createViewManagers( ReactApplicationContext reactContext) {
        return Collections.emptyList();
    }
}
