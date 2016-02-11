package org.freedesktop.gstreamer;

import org.freedesktop.gstreamer.lowlevel.GstEncodingContainerProfileAPI;
import org.freedesktop.gstreamer.lowlevel.GstNative;

public class EncodingContainerProfile extends EncodingProfile {
    public static final String GTYPE_NAME = "GstEncodingContainerProfile";
    private static final GstEncodingContainerProfileAPI gst = GstNative.load("gstpbutils", GstEncodingContainerProfileAPI.class);

	public EncodingContainerProfile(Initializer init) {
		super(init);
	}
    
    public EncodingContainerProfile(String name, String description, Caps format, String preset) {
    	this(initializer(gst.ptr_gst_encoding_container_profile_new(name, description, format, preset)));
    }
    
    public EncodingContainerProfile(String name, Caps format) {
    	this(name, name, format, null);
    }
    
    public boolean add(EncodingProfile profile) {
    	return gst.gst_encoding_container_profile_add_profile(this, profile);
    }
}
