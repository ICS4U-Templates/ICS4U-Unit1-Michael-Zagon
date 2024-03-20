/**
 * The program is the mean and median calcuator for unit-1-06
 *
 * By: Michael Zagon
 * Version: 1.0
 * Since: 2024-03-18
 */

import { readFileSync } from 'fs'

/**
 * @param {Array<number>} listArray parameter one as a number
 * @returns {number} return mean value as a number
 */
function MeanCalculation(listArray: number[]): number {
  // process
  let sum = 0
  const arraySize = listArray.length
  for (let loopCounterTwo = 0; loopCounterTwo < arraySize; loopCounterTwo++) {
    sum += listArray[loopCounterTwo]
  }
  const mean = sum / arraySize
  return mean
}

/**
 * @param {Array<number>} listArray parameter one as a number
 * @returns {number} return median value as a number
 */
function MedianCalculation(listArray: number[]): number {
  // process
  let median = 0

  const sortedArray = listArray.sort(function(a, b) {
    return a - b
  })

  const arraySize = listArray.length

  if (arraySize % 2 === 0) {
    median = (sortedArray[arraySize / 2] + sortedArray[arraySize / 2 - 1]) / 2
  } else {
    median = sortedArray[(arraySize - 1) / 2]
  }
  return median
}

const file = readFileSync(process.argv[2], 'utf8')
const newArray = file.split(/\r?\n/)
// pop last element, since it will be empty (the EOF)
newArray.pop()

const listArray = []

for (
  let loopCounterOne = 0;
  loopCounterOne < newArray.length;
  loopCounterOne++
) {
  listArray.push(Number(newArray[loopCounterOne]))
}

console.log(`The mean is: ${MeanCalculation(listArray)}`)
console.log(`The median is: ${MedianCalculation(listArray)}`)

console.log('\nDone.')
