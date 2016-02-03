package org.freedesktop.gstreamer.lowlevel;

import org.freedesktop.gstreamer.Caps;
import org.freedesktop.gstreamer.EncodingProfile;
import org.freedesktop.gstreamer.lowlevel.annotations.CallerOwnsReturn;

import com.sun.jna.Pointer;

public interface GstEncodingAudioProfileAPI extends com.sun.jna.Library {
	GstEncodingAudioProfileAPI GSTENCODINGPROFILE_API = GstNative.load("gstpbutils", GstEncodingAudioProfileAPI.class);
	
	@CallerOwnsReturn Pointer ptr_gst_encoding_audio_profile_new(Caps format, String preset, Caps restriction, int presence);
    @CallerOwnsReturn EncodingProfile gst_encoding_audio_profile_new(Caps format, String preset, Caps restriction, int presence);
}
