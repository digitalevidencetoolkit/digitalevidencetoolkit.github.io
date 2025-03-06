---
title: Addressing the Berkeley protocol
description: How the Toolkit fares with regards to the Berkeley Protocol's criteria
author: Basile Simon
date: 2021-08-25
include_footer: true
---

The leading light in terms of what we're shooting for is the **Berkeley Protocol on Digital Open Source Investigations.** The *Protocol* defines an adequate preservation as respecting certain criteria.

**Here's how the Digital Evidence Toolkit follows these guidelines:**

---

### Authenticity

**"A digital item remains unchanged from when it was collected"**

The Toolkit preserves content and authenticity proofs (SHA256 hashes of all files and bundles, a U.S. federal standard) separately and implements both the verification of an item and the lookup of a collection of items in the archive.

### Availability

**"The continual existence and retrievability"**

The Toolkit ships with an example user interface implementing methods to retrieve and display content. See below: Renderability.

---

### Identity

**"The identifiability and distinguishability from other items"**

All records are identified by the sum of their parts, as well as by their position in the chain of records, such as each identifier is unique.

### Persistence

**"The integrity and viability: the bit sequences must be intact"**

The Toolkit never edits the original files but constantly relies on their identity: their bit sequence (see hashing above, in Authenticity).

---

### Renderability

**"The ability of humans or machines to use or interact with a digital item"**

In addition to implementing a user interface demonstrating its programmatic equivalent, the file formats chosen by the Toolkit have been around for more than 25 years and protected by the W3C, a standards organisation.

### Understandability

**"The ability to interpret and understand a digital item"**

The Toolkit captures items as they were understood by the researcher/case builder, and exposes them to the user again.

---

A number of investigation-specific issues are also noted by the *Protocol* and are at the heart of the Toolkit, driving its features:

### Chain of custody

**"The chronological documentation of the sequence of custodians of a piece of information or evidence"**

By leveraging the ledger technology, the Toolkit implements a perfect log of everything that happens to the archive as it grows. The resulting log is immutable and as an implementation of a Merkle Tree, further intertwines each record's history with others' in the chain.

### Evidentiary and Working copies

**"A working copy should be created and stored separately so that investigators can work with the copy, rather than the original. Any and all changes to the item, including the making of copies, should be documented"**

While accessing the originals manually is possible, the Toolkit and its user interface both implement the generation of working copies, on request. Automatic creation at the moment of addition to the archive is also possible. All changes can be documented in the ledger – see above: Chain of custody.

### Storage

**"Helps ensure the persistence of digital items and the ability to find and retrieve them"**

The Toolkit is built as a general-purpose solution where file management can be accomplished in different, from sensitive investigations conducted on one machine to full storage in the cloud from the point of record. We aim to leverage cloud technology and multiple duplication across data-centres to increase the reliability of the access to the originals.
