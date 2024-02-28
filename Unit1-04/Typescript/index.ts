/**
 * This is the dice game
 *
 * By: Michael Zagon
 * Version: 1.0
 * Since: 2024-02-27
 */

import { createPrompt } from 'bun-promptx'

let counter = 1
const max = 6
const min = 1
const randomNumber = Math.floor(Math.random() * max) + min

while (true) {
  const userInput = prompt('Guess a number between 1 and 6:  ')
  const userGuess = parseFloat(userInput)

  if (userGuess > max || userGuess < min) {
    console.log('Invalid Input')
  } else {
    if (userGuess < max || userGuess > min) {
      if (userGuess === randomNumber) {
        console.log('You are correct!')
        console.log(`It took you ${counter} attempts!`)
        break
      } else if (userGuess > randomNumber) {
        console.log('You guessed too high')
        console.log(`Guess again.`)
      } else if (userGuess < randomNumber) {
        console.log(`You guessed too low.`)
        console.log('Guess again')
      }
      counter = counter + 1
    } else {
      console.log('Invalid Input')
      break
    }
  }
}
console.log('\nDone.')
