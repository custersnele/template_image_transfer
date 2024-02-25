import java.awt.image.BufferedImage;
import java.io.InputStream;
import java.io.OutputStream;

public class Util {

	public static void sendImage(OutputStream outputStream, BufferedImage bufferedImage, String type) {
		// TODO: create a DataOutputStream object using the provided outputStream.
		// TODO: initialize a ByteArrayOutputStream to hold the incoming image bytes.
		// TODO: write the BufferedImage to the ByteArrayOutputStream.
		// TODO: sent the size of the ByteArrayOutputStream using the DataOutputStream (writeLong)
		// TODO: sent the image data in the ByteArrayOutputStream to the DataOutputStream.
		// TODO: flush the ByteArrayOutputStream to ensure all data has been written to the stream

		// TODO: add exception handling
	}



	public static BufferedImage receiveImage(InputStream inputStream) {
		// TODO: Create a DataInputStream object using the provided inputStream to read data.
		// TODO:Read the first piece of data from the stream, which represents the size of the image being sent.

		// TODO: Initialize a ByteArrayOutputStream to hold the incoming image bytes.
		// TODO: Create a loop to read the image data from the DataInputStream. Define a byte array buffer (e.g., byte[4096]) for reading chunks of the image data and write the chunks to the ByteArrayOutputStream.

		// TODO: Flush the ByteArrayOutputStream to ensure all data has been written to the stream

		// TODO: convert the ByteArrayOutputStream to a BufferedImage

		// TODO: add excption handling

		return null;
	}

	public static BufferedImage convertToGrayscale(BufferedImage originalImage) {
		// TODO: throw an exception when the original image is null

		// TODO: create a new BufferedImage with the same dimensions and type as the original

		// TODO: convert each pixel to grayscale

		// TODO: return the grayscale image

		return null;
	}
}
