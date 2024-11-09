package com.ucsc.automation.utils;

import io.appium.java_client.android.options.UiAutomator2Options;

import java.io.File;

public class CapabilityOptions {
    public static UiAutomator2Options getAndroidCapabilities() {
        UiAutomator2Options uiAutomator2Options = new UiAutomator2Options();
        uiAutomator2Options.setPlatformName("Android");
        uiAutomator2Options.setPlatformVersion("13");
        uiAutomator2Options.setDeviceName("Pixel 3a API 33");
        uiAutomator2Options.setAutomationName("UiAutomator2");
        uiAutomator2Options.setAppActivity(".MainActivity");
        uiAutomator2Options.setAppPackage("com.wdiodemoapp");

        File file = new File(CapabilityOptions.class.getClassLoader().
                getResource("android.wdio.native.app.v1.0.8.apk").getFile());
        uiAutomator2Options.setApp(file.getAbsolutePath());
        uiAutomator2Options.setApp("");
        return uiAutomator2Options;
    }
}
