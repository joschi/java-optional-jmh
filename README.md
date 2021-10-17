# JMH benchmarks of Java primitive, nullable, and optional types

Based on the benchmark presented in the blog post Overhead of [Returning Optional Values in Java and Rust](https://pkolaczk.github.io/overhead-of-optional/).

The project runs the following benchmarks:

1. We return primitive longs and check if we need to skip by performing a comparison with the magic value directly in the summing loop.
2. We return boxed Longs and we return null whenever we need to skip a number.
3. We return boxed Longs wrapped in `Optional` and we return `Optional.empty()` whenever we need to skip a number (with and without conditional testing for presence).
4. We return boxed Longs wrapped in `OptionalLong` and we return `OptionalLong.empty()` whenever we need to skip a number (with and without conditional testing for presence).
5. We return boxed Longs wrapped in [vavr](https://www.vavr.io/)'s `Option<T>` and we return `Option.none()` whenever we need to skip a number (with and without conditional testing for presence).
6. We return boxed Longs wrapped in a custom optional-like class and we return `CustomOptionalLong.EMPTY` whenever we need to skip a number (with and without conditional testing for presence).
