/*
 * Copyright (c) 2009 Andres Colubri
 * Copyright (c) 2008 Wayne Meissner
 * Copyright (C) 2007 David Schleef <ds@schleef.org>
 *           (C) 2008 Wim Taymans <wim.taymans@gmail.com>
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

package org.freedesktop.gstreamer.elements;

import org.freedesktop.gstreamer.lowlevel.TcpAPI;

import com.sun.jna.Pointer;

/**
 * Enables an application to feed buffers into a pipeline.
 */
public class SocketSrc extends BaseSrc {
    public static final String GST_NAME = "socketsrc";
    public static final String GTYPE_NAME = "GstSocketSrc";
    
    private static final TcpAPI gst() { return TcpAPI.TCP_API; }
    
    public SocketSrc(Pointer p) {
    	super(initializer(p));
    }
     
    public SocketSrc(Initializer init) {
        super(init);
    }
   
    public SocketSrc(String name) {
    	this(makeRawElement(GST_NAME, name));
    }
    
    public SocketSrc() {
    	this((String)null);
    }
}
