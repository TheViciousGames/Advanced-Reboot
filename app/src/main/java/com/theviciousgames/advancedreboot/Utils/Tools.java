package com.theviciousgames.advancedreboot.Utils;

import android.app.Activity;
import android.content.pm.ActivityInfo;

import com.theviciousgames.advancedreboot.SU.Superuser;

public class Tools {
    public static void exit(Activity activity) {
        activity.finish();
        System.exit(0);
    }
    public static void lockPortrait(Activity activity) {
        activity.setRequestedOrientation(ActivityInfo.SCREEN_ORIENTATION_PORTRAIT);
    }
    public static void rebootSimple()
    {
        Superuser.executeCommandSU(Resources.REBOOT_SIMPLE);
    }
    public static void rebootRecovery()
    {
        Superuser.executeCommandSU(Resources.REBOOT_RECOVERY);
    }
    public static void rebootBootloader()
    {
        Superuser.executeCommandSU(Resources.REBOOT_BOOTLOADER);
    }
    public static void rebootFastboot()
    {
        Superuser.executeCommandSU(Resources.REBOOT_FASTBOOT);
    }

}
