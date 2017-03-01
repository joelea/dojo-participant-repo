# The Problem

Jane, the CEO of Gondwana, wants to send out offers to some of her customers. The requirements are:

- Anyone with an order total over $9000 should be told they will get 50% off their next order
- Anyone with an order total over $1000 should be told they will get 40% off their next order, unless they have received the above offer
- Customers should receive a text message if they have registered with a phone number and an email if they have registered with an email address (you can use the provided `EmailService` and `TextService` for this)

## Guidelines

0. You should not need to edit any classes in the `cannot.touch` package. Everything else is fair game
0. The docker tests are slower than normal unit tests, slow tests are bad, so don't test there what you could test elsewhere.
0. You'll want to use mocking.
0. The first docker test and unit tests have been written for you.
0. You should use TDD.
0. If you're struggling with your SQL, you might want to use `SUM` and `GROUP_BY`

## Getting Started
0. [Download Docker](https://www.docker.com/products/overview)
1. `./gradlew idea` or `./gradlew eclipse`
2. `open *.ipr`
3. Run the tests!

## Next Steps

If you finish the first task, try writing a migration to make the data model make more sense, or refactor the code to have the same test coverage but less test code.

