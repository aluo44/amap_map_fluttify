//////////////////////////////////////////////////////////
// GENERATED BY FLUTTIFY. DO NOT EDIT IT.
//////////////////////////////////////////////////////////

package me.yohom.amap_map_fluttify;

import android.os.Bundle;
import android.util.Log;
import android.app.Activity;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

import androidx.annotation.NonNull;
import io.flutter.embedding.engine.plugins.FlutterPlugin;
import io.flutter.embedding.engine.plugins.activity.ActivityAware;
import io.flutter.embedding.engine.plugins.activity.ActivityPluginBinding;
import io.flutter.plugin.common.BinaryMessenger;
import io.flutter.plugin.common.MethodCall;
import io.flutter.plugin.common.MethodChannel;
import io.flutter.plugin.common.PluginRegistry.Registrar;
import io.flutter.plugin.platform.PlatformViewRegistry;

import me.yohom.amap_map_fluttify.sub_handler.*;

import static me.yohom.foundation_fluttify.FoundationFluttifyPluginKt.getEnableLog;
import static me.yohom.foundation_fluttify.FoundationFluttifyPluginKt.getHEAP;

@SuppressWarnings("ALL")
public class AmapMapFluttifyPlugin implements FlutterPlugin, MethodChannel.MethodCallHandler, ActivityAware {

    private static final List<Map<String, Handler>> handlerMapList = new ArrayList<>();

    // v1 android embedding for compatible
    public static void registerWith(Registrar registrar) {
        final MethodChannel channel = new MethodChannel(registrar.messenger(), "me.yohom/amap_map_fluttify");

        AmapMapFluttifyPlugin plugin = new AmapMapFluttifyPlugin();

        BinaryMessenger messenger = registrar.messenger();
        PlatformViewRegistry platformViewRegistry = registrar.platformViewRegistry();
        Activity activity = registrar.activity();

        plugin.messenger = messenger;
        plugin.platformViewRegistry = platformViewRegistry;

        handlerMapList.add(SubHandler0.getSubHandler(messenger));
        handlerMapList.add(SubHandler1.getSubHandler(messenger));
        handlerMapList.add(SubHandler2.getSubHandler(messenger));
        handlerMapList.add(SubHandler3.getSubHandler(messenger));
        handlerMapList.add(SubHandler4.getSubHandler(messenger));
        handlerMapList.add(SubHandler5.getSubHandler(messenger));
        handlerMapList.add(SubHandler6.getSubHandler(messenger));
        handlerMapList.add(SubHandler7.getSubHandler(messenger));
        handlerMapList.add(SubHandler8.getSubHandler(messenger));
        handlerMapList.add(SubHandler9.getSubHandler(messenger));
        handlerMapList.add(SubHandler10.getSubHandler(messenger));
        handlerMapList.add(SubHandler11.getSubHandler(messenger));
        handlerMapList.add(SubHandler12.getSubHandler(messenger));
        handlerMapList.add(SubHandler13.getSubHandler(messenger));
        handlerMapList.add(SubHandler14.getSubHandler(messenger));
        handlerMapList.add(SubHandler15.getSubHandler(messenger));
        handlerMapList.add(SubHandler16.getSubHandler(messenger));
        handlerMapList.add(SubHandler17.getSubHandler(messenger));
        handlerMapList.add(SubHandler18.getSubHandler(messenger));
        handlerMapList.add(SubHandler19.getSubHandler(messenger));
        handlerMapList.add(SubHandler20.getSubHandler(messenger));
        handlerMapList.add(SubHandler21.getSubHandler(messenger));
        handlerMapList.add(SubHandler22.getSubHandler(messenger));
        handlerMapList.add(SubHandler23.getSubHandler(messenger));
        handlerMapList.add(SubHandler24.getSubHandler(messenger));
        handlerMapList.add(SubHandler25.getSubHandler(messenger));

        channel.setMethodCallHandler(plugin);

        // register platform view
        platformViewRegistry.registerViewFactory("me.yohom/com.amap.api.maps.offlinemap.DownloadProgressView", new DownloadProgressViewFactory(messenger, activity));
        platformViewRegistry.registerViewFactory("me.yohom/com.amap.api.maps.TextureMapView", new TextureMapViewFactory(messenger, activity));
        platformViewRegistry.registerViewFactory("me.yohom/com.amap.api.maps.WearMapView", new WearMapViewFactory(messenger, activity));
        platformViewRegistry.registerViewFactory("me.yohom/com.amap.api.maps.MapView", new MapViewFactory(messenger, activity));
    }

    private BinaryMessenger messenger;
    private PlatformViewRegistry platformViewRegistry;

    // v2 android embedding
    @Override
    public void onAttachedToEngine(FlutterPluginBinding binding) {
        final MethodChannel channel = new MethodChannel(binding.getBinaryMessenger(), "me.yohom/amap_map_fluttify");

        messenger = binding.getBinaryMessenger();
        platformViewRegistry = binding.getPlatformViewRegistry();

        handlerMapList.add(SubHandler0.getSubHandler(messenger));
        handlerMapList.add(SubHandler1.getSubHandler(messenger));
        handlerMapList.add(SubHandler2.getSubHandler(messenger));
        handlerMapList.add(SubHandler3.getSubHandler(messenger));
        handlerMapList.add(SubHandler4.getSubHandler(messenger));
        handlerMapList.add(SubHandler5.getSubHandler(messenger));
        handlerMapList.add(SubHandler6.getSubHandler(messenger));
        handlerMapList.add(SubHandler7.getSubHandler(messenger));
        handlerMapList.add(SubHandler8.getSubHandler(messenger));
        handlerMapList.add(SubHandler9.getSubHandler(messenger));
        handlerMapList.add(SubHandler10.getSubHandler(messenger));
        handlerMapList.add(SubHandler11.getSubHandler(messenger));
        handlerMapList.add(SubHandler12.getSubHandler(messenger));
        handlerMapList.add(SubHandler13.getSubHandler(messenger));
        handlerMapList.add(SubHandler14.getSubHandler(messenger));
        handlerMapList.add(SubHandler15.getSubHandler(messenger));
        handlerMapList.add(SubHandler16.getSubHandler(messenger));
        handlerMapList.add(SubHandler17.getSubHandler(messenger));
        handlerMapList.add(SubHandler18.getSubHandler(messenger));
        handlerMapList.add(SubHandler19.getSubHandler(messenger));
        handlerMapList.add(SubHandler20.getSubHandler(messenger));
        handlerMapList.add(SubHandler21.getSubHandler(messenger));
        handlerMapList.add(SubHandler22.getSubHandler(messenger));
        handlerMapList.add(SubHandler23.getSubHandler(messenger));
        handlerMapList.add(SubHandler24.getSubHandler(messenger));
        handlerMapList.add(SubHandler25.getSubHandler(messenger));

        channel.setMethodCallHandler(this);
    }

    @Override
    public void onDetachedFromEngine(FlutterPluginBinding binding) {

    }

    @Override
    public void onAttachedToActivity(ActivityPluginBinding binding) {
        Activity activity = binding.getActivity();

        // register platform view
        platformViewRegistry.registerViewFactory("me.yohom/com.amap.api.maps.offlinemap.DownloadProgressView", new DownloadProgressViewFactory(messenger, activity));
        platformViewRegistry.registerViewFactory("me.yohom/com.amap.api.maps.TextureMapView", new TextureMapViewFactory(messenger, activity));
        platformViewRegistry.registerViewFactory("me.yohom/com.amap.api.maps.WearMapView", new WearMapViewFactory(messenger, activity));
        platformViewRegistry.registerViewFactory("me.yohom/com.amap.api.maps.MapView", new MapViewFactory(messenger, activity));
    }

    @Override
    public void onDetachedFromActivityForConfigChanges() { }

    @Override
    public void onReattachedToActivityForConfigChanges(ActivityPluginBinding binding) { }

    @Override
    public void onDetachedFromActivity() { }

    @Override
    public void onMethodCall(@NonNull MethodCall methodCall, @NonNull MethodChannel.Result methodResult) {
        Handler handler = null;
        for (Map<String, Handler> handlerMap : handlerMapList) {
            if (handlerMap.containsKey(methodCall.method)) {
                handler = handlerMap.get(methodCall.method);
                break;
            }
        }
        if (handler != null) {
            try {
                handler.call(methodCall.arguments, methodResult);
            } catch (Exception e) {
                e.printStackTrace();
                methodResult.error(e.getMessage(), null, null);
            }
        } else {
            methodResult.notImplemented();
        }
    }

    @FunctionalInterface
    public static interface Handler {
        void call(Object args, MethodChannel.Result methodResult) throws Exception;
    }
}
