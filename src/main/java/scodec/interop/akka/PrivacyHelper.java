package scodec.interop.akka;

import java.nio.ByteBuffer;

import akka.util.ByteString.ByteString1C;

interface PrivacyHelper {

	static ByteString1C createByteString1C(ByteBuffer buffer) {
		return new ByteString1C(buffer.array());
	}
	
}
