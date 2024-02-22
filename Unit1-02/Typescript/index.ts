/**
 * Calculating energy using e=mc^2
 *
 * By: Michael Zagon
 * Version: 1.0
 * Since: 2024-02-20
 */

import { createPrompt } from 'bun-promptx'

// constants
const speedoflight = 299792458

// user input
const usermass = createPrompt("Enter the mass of an object in kilograms: ")

// incase of error
const mass = parseFloat(usermass.value || "-1")
if (isNaN(mass) == true || mass < 0) {
  console.log("Invalid input")
} else {

  // process
  const energy = mass*speedoflight ** 2

  // output
  console.log(`${mass} kg would produce ${energy.toExponential(10)} J of energy.`)
}

console.log("\nDone.")
