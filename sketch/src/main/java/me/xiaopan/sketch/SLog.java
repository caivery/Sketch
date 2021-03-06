/*
 * Copyright (C) 2016 Peng fei Pan <sky@xiaopan.me>
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *   http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package me.xiaopan.sketch;

import android.text.TextUtils;
import android.util.Log;

/**
 * Sketch日志
 */
public class SLog {
    private static final String TAG_NAME = "%s-%s";
    private static final String DEFAULT_FORMAL = "%s";

    public static void v(LogType type, String name, String format, Object... args) {
        if (type != null && !type.isEnabled()) {
            return;
        }

        String tag = Sketch.TAG;
        if (!TextUtils.isEmpty(name)) {
            tag = String.format(TAG_NAME, Sketch.TAG, name);
        }

        if (TextUtils.isEmpty(format)) {
            format = DEFAULT_FORMAL;
        }

        Log.v(tag, String.format(format, args));
    }

    public static void v(LogType type, String format, Object... args) {
        v(type, null, format, args);
    }

    public static void v(String name, String format, Object... args) {
        v(null, name, format, args);
    }

    public static void v(LogType type, String name, String text) {
        if (type != null && !type.isEnabled()) {
            return;
        }

        String tag = Sketch.TAG;
        if (!TextUtils.isEmpty(name)) {
            tag = String.format(TAG_NAME, Sketch.TAG, name);
        }

        Log.v(tag, text);
    }

    public static void v(LogType type, String text) {
        v(type, null, text);
    }

    public static void v(String text) {
        v(null, null, text);
    }



    public static void i(LogType type, String name, String format, Object... args) {
        if (type != null && !type.isEnabled()) {
            return;
        }

        String tag = Sketch.TAG;
        if (!TextUtils.isEmpty(name)) {
            tag = String.format(TAG_NAME, Sketch.TAG, name);
        }

        if (TextUtils.isEmpty(format)) {
            format = DEFAULT_FORMAL;
        }

        Log.i(tag, String.format(format, args));
    }

    public static void i(LogType type, String format, Object... args) {
        i(type, null, format, args);
    }

    public static void i(String name, String format, Object... args) {
        i(null, name, format, args);
    }

    public static void i(LogType type, String name, String text) {
        if (type != null && !type.isEnabled()) {
            return;
        }

        String tag = Sketch.TAG;
        if (!TextUtils.isEmpty(name)) {
            tag = String.format(TAG_NAME, Sketch.TAG, name);
        }

        Log.i(tag, text);
    }

    public static void i(LogType type, String text) {
        i(type, null, text);
    }

    public static void i(String text) {
        i(null, null, text);
    }



    public static void d(LogType type, String name, String format, Object... args) {
        if (type != null && !type.isEnabled()) {
            return;
        }

        String tag = Sketch.TAG;
        if (!TextUtils.isEmpty(name)) {
            tag = String.format(TAG_NAME, Sketch.TAG, name);
        }

        if (TextUtils.isEmpty(format)) {
            format = DEFAULT_FORMAL;
        }

        Log.d(tag, String.format(format, args));
    }

    public static void d(LogType type, String format, Object... args) {
        d(type, null, format, args);
    }

    public static void d(String name, String format, Object... args) {
        d(null, name, format, args);
    }

    public static void d(LogType type, String name, String text) {
        if (type != null && !type.isEnabled()) {
            return;
        }

        String tag = Sketch.TAG;
        if (!TextUtils.isEmpty(name)) {
            tag = String.format(TAG_NAME, Sketch.TAG, name);
        }

        Log.d(tag, text);
    }

    public static void d(LogType type, String text) {
        d(type, null, text);
    }

    public static void d(String text) {
        d(null, null, text);
    }



    public static void w(LogType type, String name, String format, Object... args) {
        if (type != null && !type.isEnabled()) {
            return;
        }

        String tag = Sketch.TAG;
        if (!TextUtils.isEmpty(name)) {
            tag = String.format(TAG_NAME, Sketch.TAG, name);
        }

        if (TextUtils.isEmpty(format)) {
            format = DEFAULT_FORMAL;
        }

        Log.w(tag, String.format(format, args));
    }

    public static void w(LogType type, String format, Object... args) {
        w(type, null, format, args);
    }

    public static void w(String name, String format, Object... args) {
        w(null, name, format, args);
    }

    public static void w(LogType type, String name, String text) {
        if (type != null && !type.isEnabled()) {
            return;
        }

        String tag = Sketch.TAG;
        if (!TextUtils.isEmpty(name)) {
            tag = String.format(TAG_NAME, Sketch.TAG, name);
        }

        Log.w(tag, text);
    }

    public static void w(LogType type, String text) {
        w(type, null, text);
    }

    public static void w(String text) {
        w(null, null, text);
    }



    public static void e(LogType type, String name, String format, Object... args) {
        if (type != null && !type.isEnabled()) {
            return;
        }

        String tag = Sketch.TAG;
        if (!TextUtils.isEmpty(name)) {
            tag = String.format(TAG_NAME, Sketch.TAG, name);
        }

        if (TextUtils.isEmpty(format)) {
            format = DEFAULT_FORMAL;
        }

        Log.e(tag, String.format(format, args));
    }

    public static void e(LogType type, String format, Object... args) {
        e(type, null, format, args);
    }

    public static void e(String name, String format, Object... args) {
        e(null, name, format, args);
    }

    public static void e(LogType type, String name, String text) {
        if (type != null && !type.isEnabled()) {
            return;
        }

        String tag = Sketch.TAG;
        if (!TextUtils.isEmpty(name)) {
            tag = String.format(TAG_NAME, Sketch.TAG, name);
        }

        Log.e(tag, text);
    }

    public static void e(LogType type, String text) {
        e(type, null, text);
    }

    public static void e(String text) {
        e(null, null, text);
    }
}
