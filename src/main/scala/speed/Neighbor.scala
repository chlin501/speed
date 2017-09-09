package speed

import speed._
import speed.api.Position

case class Neighbor(
  neighborId: NeighborID,
  position: Position,
  sendToDelay: SendToDelay,
  /**
   * Created time denotes when the neighbor information was refreshed.
   * After expireTime, if neighbor information is not refreshed; then 
   * remove neighbor entry in Node's neighbors table.
   */
  createdTime: Long,
  expireTime: ExpireTime
)
