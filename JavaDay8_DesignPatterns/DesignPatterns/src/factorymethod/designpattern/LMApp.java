package factorymethod.designpattern;

public class LMApp {

	public static void main(String[] args) {

		Creator roadTransportRequest = new RoadCreatorImp();

		Logistics truck1 = roadTransportRequest.getTransport();
		Logistics truck2 = roadTransportRequest.getTransport();

		System.out.println(truck1.doTransport());
		System.out.println(truck2.doTransport());

		Creator shipTransportRequest = new ShipCreatorImp();

		Logistics ship1 = shipTransportRequest.getTransport();

		Logistics ship2 = shipTransportRequest.getTransport();

		System.out.println(ship1.doTransport());

		System.out.println(ship2.doTransport());

	}

}
