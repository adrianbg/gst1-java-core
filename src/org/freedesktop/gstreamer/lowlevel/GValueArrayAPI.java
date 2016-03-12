/*
 * Copyright (c) 2009 Levente Farkas
 * Copyright (c) 2008 Andres Colubri
 * Copyright (c) 2007 Wayne Meissner
 * 
 * This file is part of gstreamer-java.
 *
 * This code is free software: you can redistribute it and/or modify it under
 * the terms of the GNU Lesser General Public License version 3 only, as
 * published by the Free Software Foundation.
 *
 * This code is distributed in the hope that it will be useful, but WITHOUT
 * ANY WARRANTY; without even the implied warranty of MERCHANTABILITY or
 * FITNESS FOR A PARTICULAR PURPOSE.  See the GNU Lesser General Public License
 * version 3 for more details.
 *
 * You should have received a copy of the GNU Lesser General Public License
 * version 3 along with this work.  If not, see <http://www.gnu.org/licenses/>.
 */

package org.freedesktop.gstreamer.lowlevel;

import java.util.HashMap;

import org.freedesktop.gstreamer.GObject;
import org.freedesktop.gstreamer.glib.GQuark;
import org.freedesktop.gstreamer.lowlevel.GValueAPI.GValue;

import com.sun.jna.Callback;
import com.sun.jna.Library;
import com.sun.jna.NativeLong;
import com.sun.jna.Pointer;
import com.sun.jna.ptr.IntByReference;
import java.util.Arrays;
import java.util.Collections;
import java.util.List;

/**
 *
 */
@SuppressWarnings("serial")
public interface GValueArrayAPI extends Library {
	GValueArrayAPI GVALUEARRAY_API = GNative.loadLibrary("gobject-2.0", GValueArrayAPI.class,
			new HashMap<String, Object>() {{
				put(Library.OPTION_TYPE_MAPPER, new GTypeMapper());
			}});

	Pointer g_value_array_get_nth_pointer(Pointer gValueArray, int i);
	GValue g_value_array_get_nth(Pointer gValueArray, int i);
}
