package org.freedesktop.gstreamer.lowlevel;

import java.util.HashMap;

import com.sun.jna.Library;

public interface GSocketAPI extends Library {
	GSocketAPI GSOCKET_API = GNative.loadLibrary("gio-2.0", GSocketAPI.class, new HashMap<String, Object>() {{
        put(Library.OPTION_TYPE_MAPPER, new GTypeMapper());
    }});
	
	
}
