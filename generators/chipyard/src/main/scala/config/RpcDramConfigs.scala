package chipyard

import org.chipsalliance.cde.config.Config

class RpcDramRocketConfig extends Config(
  new rpcdram.WithRpcDram(address = 0x100000000L, size = 0x10000000L) ++
  new freechips.rocketchip.rocket.WithNHugeCores(1) ++
  new chipyard.config.AbstractConfig)
