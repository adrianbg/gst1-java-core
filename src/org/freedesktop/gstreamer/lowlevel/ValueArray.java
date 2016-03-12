package org.freedesktop.gstreamer.lowlevel;

import java.util.HashMap;

import org.freedesktop.gstreamer.lowlevel.GValueAPI.GValue;

import com.sun.jna.Library;
import com.sun.jna.Pointer;

public class ValueArray extends NativeObject {
	GValueArrayAPI GVALUEARRAY_API = GNative.loadLibrary("gobject-2.0", GValueArrayAPI.class,
			new HashMap<String, Object>() {{
				put(Library.OPTION_TYPE_MAPPER, new GTypeMapper());
			}});

	protected ValueArray(Initializer init) {
		super(init);
		// TODO Auto-generated constructor stub
	}
	
	public ValueArray(Pointer nativeAddress) {
		this(initializer(nativeAddress));
	}
	
	public GValue get(int i) {
		return GVALUEARRAY_API.g_value_array_get_nth(this.getNativeAddress(), i);
	}

	@Override
	protected void disposeNativeHandle(Pointer ptr) {
		// TODO Auto-generated method stub
		
	}
}
