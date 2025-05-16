package week4.day1;

public class APIClient {

	public void sendRequest(String endpoint) {
		System.out.println(endpoint);
	}

	public void sendRequest(String endpoint, String requestBody, boolean requestStatus) {
		System.out.println(endpoint + requestBody + requestStatus);
	}

	public static void main(String[] args) {
		APIClient clientOptions = new APIClient();
		clientOptions.sendRequest("Endpoint");
		clientOptions.sendRequest("Endpoint  " + "Requestbody  " + false);

	}
}
