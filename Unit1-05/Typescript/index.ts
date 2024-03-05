/**
 * This program shows the volume of a wooden board based off users
 *  inputed width and length
 *
 * By: Michael Zagon
 * Version: 1.0
 * Since 2024-02-28
 */

import { createPrompt } from 'bun-promptx'

const min = 0

/**
 * @param {number} height of board.
 * @param {number} width of board.
 * @returns {number} length of the wood.
 */

function boardFoot(height, width) {
  const board = 144
  const userLength = Math.round(board / (width * height))
  return userLength
}

console.log(
  'This program figures out the length of a wooden board',
  'that is 1 board foot in dimension',
  '(1 board foot is 144 inches³ of wood)')

const userInput = prompt('Enter the width(inch): ')
const width = parseFloat(userInput)
const userInputTwo = prompt('Enter your height(inch): ')
const height = parseFloat(userInputTwo)

if (width <= min || height <= min) {
  console.log('Invalid Input')
} else if (isNaN(width) || isNaN(height)) {
  console.log('Invalid Input')
} else {
  const userLength = boardFoot(height, width)
  console.log(`The wood should be ${userLength} inch(es) long.`)
}
console.log('\nDone.')
