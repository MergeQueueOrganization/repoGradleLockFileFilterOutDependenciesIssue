package example

import com.google.protobuf.Message
import com.google.protobuf.ByteString

class ProtobufExample {

    fun messageSize(message: Message): Int {
        return message.serializedSize
    }

    fun bytesFromString(value: String): ByteString {
        return ByteString.copyFromUtf8(value)
    }
}
