package speed.beacon

import speed.api.Packet

// Periodically broadcast to the network.
// Identify the traffic change inside the network
// 1. delay estimation 
// 2. backpressure 
trait Beacon {

  /**
   * Default beacon every 5 seconds.
   * When nodes within network are stationary or slow moving, set the value
   * to None, indicating rate is very low.
   */
  var rate: Option[Long] = Option(5)

  def isStationary: Boolean

  /**
   *  Periodically broadcast beacn packet to its neighbors for exchanging
   *  location information between neighbors.
   */
  def broadcast[T](packet: Packet[T])

}
