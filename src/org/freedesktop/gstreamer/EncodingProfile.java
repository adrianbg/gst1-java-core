package org.freedesktop.gstreamer;

import java.util.logging.Logger;

public abstract class EncodingProfile extends GstObject {
	public EncodingProfile(Initializer init) {
		super(init);
		// TODO Auto-generated constructor stub
	}

    public static final String GTYPE_NAME = "GstEncodingProfile";

	private static Logger logger = Logger.getLogger(EncodingProfile.class.getName());

    //private static final GstEncodingAudioProfileAPI gst = GstNative.load(GstEncodingAudioProfileAPI.class);
 
}
