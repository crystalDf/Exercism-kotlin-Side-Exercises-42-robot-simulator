class Robot(var gridPosition: GridPosition = GridPosition(0, 0),
            var orientation: Orientation = Orientation.NORTH) {

    fun simulate(instructions: String) {

        val size = Orientation.values().size

        instructions.forEach { when(it) {
            'R' -> orientation = Orientation.values()[(orientation.ordinal + 1) % size]
            'L' -> orientation = Orientation.values()[(orientation.ordinal - 1 + size) % size]
            'A' -> gridPosition = when(orientation) {
                Orientation.NORTH -> GridPosition(gridPosition.x, gridPosition.y + 1)
                Orientation.EAST -> GridPosition(gridPosition.x + 1, gridPosition.y)
                Orientation.SOUTH -> GridPosition(gridPosition.x, gridPosition.y - 1)
                Orientation.WEST -> GridPosition(gridPosition.x - 1, gridPosition.y)
            }
        } }
    }
}
