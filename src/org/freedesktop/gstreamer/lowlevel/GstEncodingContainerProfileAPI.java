package org.freedesktop.gstreamer.lowlevel;

import org.freedesktop.gstreamer.Caps;
import org.freedesktop.gstreamer.EncodingContainerProfile;
import org.freedesktop.gstreamer.EncodingProfile;
import org.freedesktop.gstreamer.lowlevel.annotations.CallerOwnsReturn;

import com.sun.jna.Pointer;

public interface GstEncodingContainerProfileAPI extends com.sun.jna.Library {
	GstEncodingContainerProfileAPI GSTENCODINGCONTAINERPROFILE_API = GstNative.load("gstpbutils", GstEncodingContainerProfileAPI.class);
	
	@CallerOwnsReturn Pointer ptr_gst_encoding_container_profile_new(String name, String description, Caps format, String preset);
    @CallerOwnsReturn EncodingContainerProfile gst_encoding_container_profile_new(String name, String description, Caps format, String preset);
    boolean gst_encoding_container_profile_add_profile(EncodingContainerProfile container, EncodingProfile profile);
}
