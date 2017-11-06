package java.nio.file;

import org.assertj.core.api.AbstractObjectAssert;
import org.assertj.core.internal.Iterables;
import org.assertj.core.util.Objects;

/**
 * {@link Path} specific assertions - Generated by CustomAssertionGenerator.
 */
@javax.annotation.Generated(value="assertj-assertions-generator")
public class PathAssert extends AbstractObjectAssert<PathAssert, Path> {

  /**
   * Creates a new <code>{@link PathAssert}</code> to make assertions on actual Path.
   * @param actual the Path we want to make assertions on.
   */
  public PathAssert(Path actual) {
    super(actual, PathAssert.class);
  }

  /**
   * An entry point for PathAssert to follow AssertJ standard <code>assertThat()</code> statements.<br>
   * With a static import, one can write directly: <code>assertThat(myPath)</code> and get specific assertion with code completion.
   * @param actual the Path we want to make assertions on.
   * @return a new <code>{@link PathAssert}</code>
   */
  @org.assertj.core.util.CheckReturnValue
  public static PathAssert assertThat(Path actual) {
    return new PathAssert(actual);
  }

  /**
   * Verifies that the actual Path is absolute.
   * @return this assertion object.
   * @throws AssertionError - if the actual Path is not absolute.
   */
  public PathAssert isAbsolute() {
    // check that actual Path we want to make assertions on is not null.
    isNotNull();

    // check that property call/field access is true
    if (!actual.isAbsolute()) {
      failWithMessage("\nExpecting that actual Path is absolute but is not.");
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Path is not absolute.
   * @return this assertion object.
   * @throws AssertionError - if the actual Path is absolute.
   */
  public PathAssert isNotAbsolute() {
    // check that actual Path we want to make assertions on is not null.
    isNotNull();

    // check that property call/field access is false
    if (actual.isAbsolute()) {
      failWithMessage("\nExpecting that actual Path is not absolute but is.");
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Path's fileName contains the given Path elements.
   * @param fileName the given elements that should be contained in actual Path's fileName.
   * @return this assertion object.
   * @throws AssertionError if the actual Path's fileName does not contain all given Path elements.
   */
  public PathAssert hasFileName(Path... fileName) {
    // check that actual Path we want to make assertions on is not null.
    isNotNull();

    // check that given Path varargs is not null.
    if (fileName == null) failWithMessage("Expecting fileName parameter not to be null.");

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getFileName(), fileName);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Path's fileName contains the given Path elements in Collection.
   * @param fileName the given elements that should be contained in actual Path's fileName.
   * @return this assertion object.
   * @throws AssertionError if the actual Path's fileName does not contain all given Path elements.
   */
  public PathAssert hasFileName(java.util.Collection<? extends Path> fileName) {
    // check that actual Path we want to make assertions on is not null.
    isNotNull();

    // check that given Path collection is not null.
    if (fileName == null) {
      failWithMessage("Expecting fileName parameter not to be null.");
      return this; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getFileName(), fileName.toArray());

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Path's fileName contains <b>only</b> the given Path elements and nothing else in whatever order.
   * @param fileName the given elements that should be contained in actual Path's fileName.
   * @return this assertion object.
   * @throws AssertionError if the actual Path's fileName does not contain all given Path elements.
   */
  public PathAssert hasOnlyFileName(Path... fileName) {
    // check that actual Path we want to make assertions on is not null.
    isNotNull();

    // check that given Path varargs is not null.
    if (fileName == null) failWithMessage("Expecting fileName parameter not to be null.");

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getFileName(), fileName);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Path's fileName contains <b>only</b> the given Path elements in Collection and nothing else in whatever order.
   * @param fileName the given elements that should be contained in actual Path's fileName.
   * @return this assertion object.
   * @throws AssertionError if the actual Path's fileName does not contain all given Path elements.
   */
  public PathAssert hasOnlyFileName(java.util.Collection<? extends Path> fileName) {
    // check that actual Path we want to make assertions on is not null.
    isNotNull();

    // check that given Path collection is not null.
    if (fileName == null) {
      failWithMessage("Expecting fileName parameter not to be null.");
      return this; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getFileName(), fileName.toArray());

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Path's fileName does not contain the given Path elements.
   *
   * @param fileName the given elements that should not be in actual Path's fileName.
   * @return this assertion object.
   * @throws AssertionError if the actual Path's fileName contains any given Path elements.
   */
  public PathAssert doesNotHaveFileName(Path... fileName) {
    // check that actual Path we want to make assertions on is not null.
    isNotNull();

    // check that given Path varargs is not null.
    if (fileName == null) failWithMessage("Expecting fileName parameter not to be null.");

    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getFileName(), fileName);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Path's fileName does not contain the given Path elements in Collection.
   *
   * @param fileName the given elements that should not be in actual Path's fileName.
   * @return this assertion object.
   * @throws AssertionError if the actual Path's fileName contains any given Path elements.
   */
  public PathAssert doesNotHaveFileName(java.util.Collection<? extends Path> fileName) {
    // check that actual Path we want to make assertions on is not null.
    isNotNull();

    // check that given Path collection is not null.
    if (fileName == null) {
      failWithMessage("Expecting fileName parameter not to be null.");
      return this; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getFileName(), fileName.toArray());

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Path has no fileName.
   * @return this assertion object.
   * @throws AssertionError if the actual Path's fileName is not empty.
   */
  public PathAssert hasNoFileName() {
    // check that actual Path we want to make assertions on is not null.
    isNotNull();

    // we override the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have fileName but had :\n  <%s>";

    // check
    if (actual.getFileName().iterator().hasNext()) {
      failWithMessage(assertjErrorMessage, actual, actual.getFileName());
    }

    // return the current assertion for method chaining
    return this;
  }


  /**
   * Verifies that the actual Path's fileSystem is equal to the given one.
   * @param fileSystem the given fileSystem to compare the actual Path's fileSystem to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Path's fileSystem is not equal to the given one.
   */
  public PathAssert hasFileSystem(FileSystem fileSystem) {
    // check that actual Path we want to make assertions on is not null.
    isNotNull();


    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting fileSystem of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";
    
    // check
    FileSystem actualFileSystem = actual.getFileSystem();
    System.out.println("check FileSystem");
    if (!Objects.areEqual(actualFileSystem, fileSystem)) {
      failWithMessage(assertjErrorMessage, actual, fileSystem, actualFileSystem);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Path's nameCount is equal to the given one.
   * @param nameCount the given nameCount to compare the actual Path's nameCount to.
   * @return this assertion object.
   * @throws AssertionError - if the actual Path's nameCount is not equal to the given one.
   */
  public PathAssert hasNameCount(int nameCount) {
    // check that actual Path we want to make assertions on is not null.
    isNotNull();

    // overrides the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting nameCount of:\n  <%s>\nto be:\n  <%s>\nbut was:\n  <%s>";

    // check
    int actualNameCount = actual.getNameCount();
    if (actualNameCount != nameCount) {
      failWithMessage(assertjErrorMessage, actual, nameCount, actualNameCount);
    }

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Path's parent contains the given Path elements.
   * @param parent the given elements that should be contained in actual Path's parent.
   * @return this assertion object.
   * @throws AssertionError if the actual Path's parent does not contain all given Path elements.
   */
  public PathAssert hasParent(Path... parent) {
    // check that actual Path we want to make assertions on is not null.
    isNotNull();

    // check that given Path varargs is not null.
    if (parent == null) failWithMessage("Expecting parent parameter not to be null.");

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getParent(), parent);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Path's parent contains the given Path elements in Collection.
   * @param parent the given elements that should be contained in actual Path's parent.
   * @return this assertion object.
   * @throws AssertionError if the actual Path's parent does not contain all given Path elements.
   */
  public PathAssert hasParent(java.util.Collection<? extends Path> parent) {
    // check that actual Path we want to make assertions on is not null.
    isNotNull();

    // check that given Path collection is not null.
    if (parent == null) {
      failWithMessage("Expecting parent parameter not to be null.");
      return this; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getParent(), parent.toArray());

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Path's parent contains <b>only</b> the given Path elements and nothing else in whatever order.
   * @param parent the given elements that should be contained in actual Path's parent.
   * @return this assertion object.
   * @throws AssertionError if the actual Path's parent does not contain all given Path elements.
   */
  public PathAssert hasOnlyParent(Path... parent) {
    // check that actual Path we want to make assertions on is not null.
    isNotNull();

    // check that given Path varargs is not null.
    if (parent == null) failWithMessage("Expecting parent parameter not to be null.");

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getParent(), parent);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Path's parent contains <b>only</b> the given Path elements in Collection and nothing else in whatever order.
   * @param parent the given elements that should be contained in actual Path's parent.
   * @return this assertion object.
   * @throws AssertionError if the actual Path's parent does not contain all given Path elements.
   */
  public PathAssert hasOnlyParent(java.util.Collection<? extends Path> parent) {
    // check that actual Path we want to make assertions on is not null.
    isNotNull();

    // check that given Path collection is not null.
    if (parent == null) {
      failWithMessage("Expecting parent parameter not to be null.");
      return this; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getParent(), parent.toArray());

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Path's parent does not contain the given Path elements.
   *
   * @param parent the given elements that should not be in actual Path's parent.
   * @return this assertion object.
   * @throws AssertionError if the actual Path's parent contains any given Path elements.
   */
  public PathAssert doesNotHaveParent(Path... parent) {
    // check that actual Path we want to make assertions on is not null.
    isNotNull();

    // check that given Path varargs is not null.
    if (parent == null) failWithMessage("Expecting parent parameter not to be null.");

    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getParent(), parent);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Path's parent does not contain the given Path elements in Collection.
   *
   * @param parent the given elements that should not be in actual Path's parent.
   * @return this assertion object.
   * @throws AssertionError if the actual Path's parent contains any given Path elements.
   */
  public PathAssert doesNotHaveParent(java.util.Collection<? extends Path> parent) {
    // check that actual Path we want to make assertions on is not null.
    isNotNull();

    // check that given Path collection is not null.
    if (parent == null) {
      failWithMessage("Expecting parent parameter not to be null.");
      return this; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getParent(), parent.toArray());

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Path has no parent.
   * @return this assertion object.
   * @throws AssertionError if the actual Path's parent is not empty.
   */
  public PathAssert hasNoParent() {
    // check that actual Path we want to make assertions on is not null.
    isNotNull();

    // we override the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have parent but had :\n  <%s>";

    // check
    if (actual.getParent().iterator().hasNext()) {
      failWithMessage(assertjErrorMessage, actual, actual.getParent());
    }

    // return the current assertion for method chaining
    return this;
  }


  /**
   * Verifies that the actual Path's root contains the given Path elements.
   * @param root the given elements that should be contained in actual Path's root.
   * @return this assertion object.
   * @throws AssertionError if the actual Path's root does not contain all given Path elements.
   */
  public PathAssert hasRoot(Path... root) {
    // check that actual Path we want to make assertions on is not null.
    isNotNull();

    // check that given Path varargs is not null.
    if (root == null) failWithMessage("Expecting root parameter not to be null.");

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getRoot(), root);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Path's root contains the given Path elements in Collection.
   * @param root the given elements that should be contained in actual Path's root.
   * @return this assertion object.
   * @throws AssertionError if the actual Path's root does not contain all given Path elements.
   */
  public PathAssert hasRoot(java.util.Collection<? extends Path> root) {
    // check that actual Path we want to make assertions on is not null.
    isNotNull();

    // check that given Path collection is not null.
    if (root == null) {
      failWithMessage("Expecting root parameter not to be null.");
      return this; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContains(info, actual.getRoot(), root.toArray());

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Path's root contains <b>only</b> the given Path elements and nothing else in whatever order.
   * @param root the given elements that should be contained in actual Path's root.
   * @return this assertion object.
   * @throws AssertionError if the actual Path's root does not contain all given Path elements.
   */
  public PathAssert hasOnlyRoot(Path... root) {
    // check that actual Path we want to make assertions on is not null.
    isNotNull();

    // check that given Path varargs is not null.
    if (root == null) failWithMessage("Expecting root parameter not to be null.");

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getRoot(), root);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Path's root contains <b>only</b> the given Path elements in Collection and nothing else in whatever order.
   * @param root the given elements that should be contained in actual Path's root.
   * @return this assertion object.
   * @throws AssertionError if the actual Path's root does not contain all given Path elements.
   */
  public PathAssert hasOnlyRoot(java.util.Collection<? extends Path> root) {
    // check that actual Path we want to make assertions on is not null.
    isNotNull();

    // check that given Path collection is not null.
    if (root == null) {
      failWithMessage("Expecting root parameter not to be null.");
      return this; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message, to set another message call: info.overridingErrorMessage("my error message");
    Iterables.instance().assertContainsOnly(info, actual.getRoot(), root.toArray());

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Path's root does not contain the given Path elements.
   *
   * @param root the given elements that should not be in actual Path's root.
   * @return this assertion object.
   * @throws AssertionError if the actual Path's root contains any given Path elements.
   */
  public PathAssert doesNotHaveRoot(Path... root) {
    // check that actual Path we want to make assertions on is not null.
    isNotNull();

    // check that given Path varargs is not null.
    if (root == null) failWithMessage("Expecting root parameter not to be null.");

    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getRoot(), root);

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Path's root does not contain the given Path elements in Collection.
   *
   * @param root the given elements that should not be in actual Path's root.
   * @return this assertion object.
   * @throws AssertionError if the actual Path's root contains any given Path elements.
   */
  public PathAssert doesNotHaveRoot(java.util.Collection<? extends Path> root) {
    // check that actual Path we want to make assertions on is not null.
    isNotNull();

    // check that given Path collection is not null.
    if (root == null) {
      failWithMessage("Expecting root parameter not to be null.");
      return this; // to fool Eclipse "Null pointer access" warning on toArray.
    }

    // check with standard error message (use overridingErrorMessage before contains to set your own message).
    Iterables.instance().assertDoesNotContain(info, actual.getRoot(), root.toArray());

    // return the current assertion for method chaining
    return this;
  }

  /**
   * Verifies that the actual Path has no root.
   * @return this assertion object.
   * @throws AssertionError if the actual Path's root is not empty.
   */
  public PathAssert hasNoRoot() {
    // check that actual Path we want to make assertions on is not null.
    isNotNull();

    // we override the default error message with a more explicit one
    String assertjErrorMessage = "\nExpecting :\n  <%s>\nnot to have root but had :\n  <%s>";

    // check
    if (actual.getRoot().iterator().hasNext()) {
      failWithMessage(assertjErrorMessage, actual, actual.getRoot());
    }

    // return the current assertion for method chaining
    return this;
  }


}