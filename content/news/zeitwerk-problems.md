---
title: Five small problems with proving when something existed
description: Notes from the workbench as we start building Zeitwerk — and a few questions we'd like to ask you.
author: Basile Simon
date: 2026-06-22
---


In the process of building [Zeitwerk](https://digitalevidencetoolkit.org/tools/zeitwerk-timestamping/), I want to avoid getting too deep into code right from the start, and instead pressure-test some assumptions against the people who _might_ actually need this: investigative journalists, human rights documenters, archivists, and lawyers.

So here are four small, stubborn problems _I think_ I keep running into. They're not fatal flaws, but I think together they shape whether a proof is actually useful in the room where it actually matters.

> 👋 If any of these resonate, or sound wrong to you, please be in touch: `<basile@digitalevidencetoolkit.org>`

## 1. The receipt is the proof, and receipts get lost

With [OpenTimestamps](https://opentimestamps.org/), your first receipt is a tiny, temporary "pending" submission. It only becomes a "real" proof later, once your hash has been batched into a Merkle tree and confirmed in a Bitcoin block – an hour or more later. _You're expected_ to come back and upgrade it.

That puts the operational burden on _you_, the investigator: hold onto a small file, remember to finalise it, and don't lose it – because if you lose the receipt, you lose the proof entirely. Sounds to me like a fragile place to keep something important.

## 2. The proof might reveal more than you want it to

The act of getting a timestamp can leak metadata. When you submit a hash to a calendar server, what does that server see? Your IP address? Your network location? The timing and pattern of your submissions?

Could be harmless. But for someone working under surveillance, the fact that _you_ asked for a timestamp could itself be sensitive.

## 3. Forever is a long time

Anchoring a hash into a permanent, public, append-only record is the whole point – until you ask what "permanent" means under European data protection law. Does a hash that can never be deleted sit comfortably with GDPR and the right to be forgotten?

A bare hash isn't _obviously_ personal data. But could a public hash later be linked to other records, and in doing so expose who was involved in a given timestamping event? "Immutable" and "erasable on request" are hard to satisfy at the same time, and I'd rather understand that tension early than discover it later.

## 4. Will a court actually accept this? Do they even care?

Blockchain-anchored proofs are clever, but what is their legal standing compared to an RFC 3161 timestamp from a regulated authority, or a qualified timestamp under eIDAS? In what other settings are these things actually required? That's not obvious to me – and I have a _fair_ understanding of the field of open-source documentation.

Worse still: a proof that needs an expert witness to explain Merkle trees and miner behaviour before a judge will trust it is a heavier thing to carry than a format the legal system already recognises.

One of my design questions is how to stay cryptographically honest while still speaking a language the courts might already accept.

---

Again, **if you've hit any of these**, I'd love to have a short conversation. That's how this project gets shaped!
