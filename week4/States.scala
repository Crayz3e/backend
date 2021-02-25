object States extends Enumeration {
  type State = Value
  val ZeroState, AccumulatorState, ComputedState, ErrorState = Value
}