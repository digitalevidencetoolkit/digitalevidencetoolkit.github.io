---
title: "End of grant announcement: the Toolkit is now MVP!"
description: The Toolkit enters beta software status. Here's how we'll be moving forward.
author: Basile Simon
date: 2021-08-31
include_footer: true
aliases: [/end-of-grant-announcement/]
---

The DEPToolkit is a proof-of-concept software for researchers and small teams sifting through online material.

With only one click of the mouse, the material will be **archived in a framework demonstrating chain of custody** and **stored durably**. Once included in the growing database, users will be able to **go back to search through** and **annotate the material**, and to **export working copies** of said material for publication and dissemination.

A database built thusly can be handed to a prosecutor ten years down the line, and they will be able to say with mathematical certainty: **“the material in this archive is identical and contemporary to the one saved at the time, ten years ago.”**

## Problem definition

What if digital evidence collected over a period of years, or even decades, wasn't admissible in court because it had been improperly handled by individuals with nothing but the best intentions? In the absence of internationally recognised legal standards regarding how digital forms of evidence should be recorded, handled, and archived – future prosecution efforts remain in jeopardy.

As a journalist, I've seen first-hand how some of this evidence is weighed and cleared by legal departments. As co-founder of Airwars, a monitoring NGO, I've seen first-hand the steps we took to ensure our material wouldn't disappear. And if my law studies serve me well: both the above fall short of what the courts may demand when it comes to evidentiary standards.

## Enter, the Toolkit

We want this to be the plastic sealed bag in which evidence is deposited, and which is then kept under watch in an evidence room, where each access is tracked and reported in a log.

Our Toolkit does several things:

### One click to preserve:

The Toolkit offers a one-click research tool preserving digital evidence through the web browser. The one-button browser extension delivers content to the self-hosted micro-service. No waiting, no series of things to click on. More time spent researching.

![Architecture diagram](/images/illustrations/1.svg)

### Future-proof archives and authenticity proof:

The Toolkit preserves a copy of the material _as well as_ the proof of its authenticity. Future-proof offline copies are created, and their digital signatures immediately added to a remote immutable ledger. All the material is identified by SHA256, a U.S. federal government cryptography standard.

![Architecture diagram](/images/illustrations/2.svg)

### Your archive is yours: browse, annotate, export:

The Toolkit facilitates browsing the archive thus created, its annotation and metadata enrichment, as well as the export of working copies. All access and additions are added to the immutable log, accounted for, and replayable at will.

![Architecture diagram](/images/illustrations/3.svg)

### Lookup-and-prove: reverse verification of the custody

The Toolkit provides a “lookup-and-prove” mechanism demonstrating proper chain of custody of the material, for the case where a trove of documents has to be cross-checked against the Toolkit's proof mechanisms.

![Architecture diagram](/images/illustrations/4.svg)

---

## Benefits

Our challenge with the Toolkit is **to preserve a piece of evidence from the moment it reaches us.** We're dealing with after-the-fact research, as opposed to that coming straight from the field (see for example [EyeWitness](https://www.eyewitness.global)), a star-project proposing an end-to-end, camera-to-courtroom workflow).

As I wrote before:

“**\*The Toolkit only addresses provenance and chain the custody from the moment of record.** The content stored very well may be unauthentic, doctored, or fake – but with the Toolkit, it will be adequately preserved.”\*

There are several implications in terms of metadata:

- In addition to **future-proof archives of webpages and screenshots**, we're capturing **some metadata** about pages and asking users about their potential needs beyond the
  obvious (think Google Analytics tracking codes, DNS records, etc.)
- This metadata is preserved and their unique signatures notarised in the **immutable ledger** we are using. This means that **once written in the database, there is no lossy change possible** aside from a complete deletion. Once again: we're addressing chain of custody _from the moment of record_ only.
- The centralised, Amazon Web Services-run ledger provides a hybrid method of [trusted timestamping](https://en.wikipedia.org/wiki/Trusted_timestamping) as per [ANSI ASC X9.95](https://en.wikipedia.org/wiki/ANSI_ASC_X9.95_Standard) and [ISO/IEC 18014](http://en.wikipedia.org/wiki/ISO/IEC_18014): each insertion in and revision of the ledger has a timestamp, er, _stamped_ on it by Amazon. It's a feature, not a bug – and a highly desirable one with that.

**We're now able to verifiably demonstrate appropriate custody of an archived** webpage from a point in time which could not have been faked.

---

## **Going forward**

We're working on a number of partnerships that aim to validate some of our assumptions.

From initial user interviews and contact with practitioners, we'll now be working on two parallel tracks: the collaboration on collective datasets/cases, and the interoperability with other document management systems.

We'll be offering assistance to pro bono law firms and vulnerable groups, including single victims self-documenting their troubles.

## **Useful links**

- [Newsletter](https://digitalevidencetoolkit.substack.com/)
- [Getting started](https://digitalevidencetoolkit.notion.site/Getting-started-15521f4125534f4aa758a2575c27ad5c) and [technical documentation](https://digitalevidencetoolkit.notion.site/Technical-Journal-01ad0720aebc4f9c9a8036da0fd7426b)
- [Addressing the criteria of the Berkeley Protocol](/addressing-berkeley/)
- [Releases and changelog](https://github.com/digitalevidencetoolkit/deptoolkit/releases)
- [Roadmap board](https://github.com/orgs/digitalevidencetoolkit/projects/3)
