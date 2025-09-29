# cityTransportSystem

This project implements a simple city transport system simulation using Java, demonstrating core OOP principles. 


## Packages and Key Classes:

* **entities**

  * Transport (abstract class): Base class for all transports with common fields `id`, `routeNumber`, `capacity`.
  * `Bus`, `Tram`, `Taxi`: Concrete transport subclasses extending `Transport` and have specific fields.
  * `Person` (abstract class): Base class for people with `id` and `name`.
  * `Driver`, `Passenger`: Subclasses of `Person`. `Driver` can drive transports; `Passenger` has a `ticketNumber`.
* **services**

  * `PersonService`: Interface defining methods to manage passengers and drivers.
  * `TransportService`: Interface defining methods to manage transports and passenger boarding/disembarking.
  * `impl`: Implementations of the above service interfaces managing business logic.
* **managers**

  * `CityTransportSystemManager`: Manages collections of transports, drivers, passengers. Uses services to handle boarding, disembarking, and display.


