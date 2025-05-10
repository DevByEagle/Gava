package org.gava;

public interface Graphics {
	/** @return the time span in seconds since the previous frame, provided as a raw and unsmoothed value. */
	float getRawDeltaTime();
}