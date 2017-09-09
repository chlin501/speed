package speed

import speed.api.Packet

object Node
case class Node(id: String) {

  /**
   * Store information passed by beacon.
   * Neighbor's ExpireTime is used to timeout neighbor in the neighbors table
   * if its information is not refreshed a some time.
   */
  protected[speed] var neighbors: Seq[Neighbor] = Seq.empty[Neighbor]

  /**
   * Need a scheduler periodically to scan neighbors table and remove/ invalid 
   * entry after ExpiredTime.
   */

}
