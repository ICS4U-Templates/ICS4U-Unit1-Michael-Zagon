/*
 * This program calculates the time user's food needs in the microwave
 *
 * @author  Michael Zagon
 * @version 1.0
 * @since   2024-02-22
 */

import { createPrompt } from 'bun-promptx'

// Constants
const subtime = 60
const pizzatime = 45
const souptime = 105
const two = 1.5
const three = 2
let time = 0
let minutes = 0
let seconds = 0

// Input
const userInput = prompt('Are you heating, sub, pizza or soup?: ')

// checking for valildity of user input
if (userInput === 'sub' || userInput === 'pizza' || userInput === 'soup') {
  const timeString = prompt('How many of your item are you cooking?: ')
  const amountNumber = parseFloat(timeString)

  // Process
  if (userInput === 'sub') {
    time = subtime
  } else if (userInput === 'pizza') {
    time = pizzatime
  } else if (userInput === 'soup') {
    time = souptime
  }

  if (amountNumber === 1 || amountNumber === 2 || amountNumber === 3) {
    if (amountNumber === 2) {
      time = time * two
    } else if (amountNumber === 3) {
      time = time * three
    }

    seconds = time / 60
    minutes = Math.floor(seconds)
    seconds = (seconds - minutes) * 60
    console.log(
      `The total cook time is ${minutes} minutes and ${seconds} seconds.`
    )

  } else {
    console.log('Invalid Input')
  }

} else {
  console.log('Invalid Input')
}
console.log('\nDone.')
