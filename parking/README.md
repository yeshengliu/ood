# Parking Lot

## Clarification

### What

Parking Lot: Parking space, Parking level

Vehicle: Normal size, Large size (truck, bus), Small size (motorcycle)

Parking Spot: Public, ~~Disabled~~, ~~Reserved~~

### When

~~Opening Hours~~, ~~Rush Hours~~

### Who

Management, ~~Customer~~

### How

How the parking lot support different size vehicles?

1. ~~Use normal size parking space only, large-size vehicle occupy multiple spots~~ - hard to maintain
2. ~~Use three different size parking spaces, only the corresponded size vehicle can occupy the space~~ - not flexible
3. ~~Use large-size parking space only, normal-size vehicle park in large-size parking space~~ - resource waste
4. Use three different size parking spaces
   1. small-size vehicle can park in any space
   2. normal-size vehicle can park in normal or large space
   3. large-size vehicle can only park in large parking space

How to park when a vehicle enter the parking lot?

1. ~~Find the next available spot~~
2. Assign a parking spot when a vehicle enter the parking lot

## Cases

1. Get the next available spot
2. Park vehicle
3. Clear spot
4. Checkout

## Core Objects

**Input:** Vehicle

**Output:** Receipt

Parking Lot

## Classes

Core Objects

Row, Level

Parking

## UML

![UML](./Screenshot%202023-03-27%20at%206.28.25%20AM.png)