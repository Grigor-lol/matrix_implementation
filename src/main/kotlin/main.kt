package mmcs.assignment2

fun main() {

    var lock = createMatrix(3, 3, 0);
    var key = createMatrix(2, 2, 1);

    key[0,1] = 0
    key[1,0] = 0
    lock[0,1] = 1
    lock[1,0] = 1

    println(key)
    print(lock)

    print(canOpenLock(key,lock))

    var matrix = createMatrix(3,3,0)
    matrix[0,1] = 1
    matrix[1,0] = 1

    var rotateMatrix = rotate(matrix)
    print("\n\n")

    print(matrix)
    print("\n\n")
    print(rotateMatrix)

}