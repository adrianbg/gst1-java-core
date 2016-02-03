package org.freedesktop.gstreamer;

import org.freedesktop.gstreamer.lowlevel.GstEncodingAudioProfileAPI;
import org.freedesktop.gstreamer.lowlevel.GstNative;

public class EncodingAudioProfile extends EncodingProfile {
	public static final String GTYPE_NAME = "GstEncodingAudioProfile";
    private static final GstEncodingAudioProfileAPI gst = GstNative.load("gstpbutils", GstEncodingAudioProfileAPI.class);
    
    public EncodingAudioProfile(Initializer init) {
		super(init);
	}
	
    public EncodingAudioProfile(Caps format, String preset, Caps restriction, int presence) {
    	this(initializer(gst.ptr_gst_encoding_audio_profile_new(format, preset, restriction, presence)));
    }
    
    public EncodingAudioProfile(Caps format) {
    	this(format, null, null, 0);
    }
}
