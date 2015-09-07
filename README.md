scodec-akka
===========

Provides interop between scodec and akka.

To use this project, import everything from the `scodec.interop.akka` package.

    import scodec.bits._
    import scodec.interop.akka._
    import akka.util.ByteString

    val x: ByteVector = hex"deadbeef"
    val y: ByteString = x.toByteString

Currently, this library only defines conversions between `ByteVector` and `ByteString`. Support will be added for using `Codec`s in akka streams and perhaps building streaming encoders/decoders with akka streams, similar to the support in the `scodec-stream` project.

Getting Binaries
----------------

This library is published to Maven Central under `org.scodec %% scodec-akka`.

See the [releases page on the website](http://scodec.org/releases/).

