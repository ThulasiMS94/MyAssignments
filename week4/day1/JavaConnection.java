package week4.day1;

public class JavaConnection extends MySqlConnection {

	@Override
	public void connect() {
		System.out.println("Connection request added");

	}

	@Override
	public void disconnect() {
		System.out.println("Disconnect request added");

	}

	@Override
	public void executeUpdate() {
		System.out.println("Update has been executed");

	}

	public static void main(String[] args) {
		JavaConnection connectionDetails = new JavaConnection();
		connectionDetails.connect();
		connectionDetails.disconnect();
		connectionDetails.executeUpdate();
		connectionDetails.executeQuery();
	}
}
