// Interface for Transport types
interface Transport {
    void deliver();
}

// Truck class that implements the Transport interface
class Truck implements Transport {
    public void deliver() {
        // Implementation of delivering by land in a box
    }
}

// Ship class that implements the Transport interface
class Ship implements Transport {
    public void deliver() {
        // Implementation of delivering by sea in a container
    }
}

// Factory class to create instances of Transport types
class TransportFactory {
    public Transport getTransport(String transportType) {
        if(transportType == null) {
            return null;
        }
        if(transportType.equalsIgnoreCase("TRUCK")) {
            return new Truck();
        } else if(transportType.equalsIgnoreCase("SHIP")) {
            return new Ship();
        }

        return null;
    }
}

// Usage
class FactoryDemo {
    public static void main(String[] args) {
        TransportFactory transportFactory = new TransportFactory();

        Transport truck = transportFactory.getTransport("TRUCK");
        truck.deliver();

        Transport ship = transportFactory.getTransport("SHIP");
        ship.deliver();
    }
}
