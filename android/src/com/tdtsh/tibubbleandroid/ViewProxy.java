/**
 * This file was auto-generated by the Titanium Module SDK helper for Android
 * Appcelerator Titanium Mobile
 * Copyright (c) 2009-2010 by Appcelerator, Inc. All Rights Reserved.
 * Licensed under the terms of the Apache Public License
 * Please see the LICENSE included with this distribution for details.
 *
 */
package com.tdtsh.tibubbleandroid;

import org.appcelerator.kroll.KrollDict;
import org.appcelerator.kroll.KrollProxy;
import org.appcelerator.kroll.annotations.Kroll;
import org.appcelerator.kroll.common.Log;
import org.appcelerator.kroll.common.TiConfig;
import org.appcelerator.titanium.proxy.TiViewProxy;
import org.appcelerator.titanium.view.TiUIView;

import android.app.Activity;

// This proxy can be created by calling TiBubbleAndroid.createExample({message: "hello world"})
@Kroll.proxy(creatableInModule = TiBubbleAndroidModule.class)
public class ViewProxy extends TiViewProxy {
	public ViewProxy() {
		super();
	}

	@Override
	public TiUIView createView(Activity activity) {
		return new TiBubbleAndroidView(this);
	}

}
