---
title: "Create web archives as quickly as you bookmark a page"
date: 2026-06-01
description: "Some glue between Raindrop, a bookmarking service and API, and Browsertrix Cloud to produce forensic-quality web archives"
tags: ["web-archiving", "integrity", "evidence-preservation"]
---

In response to a quick-turnaround investigation, we have put together a quick single-page preservation pipeline that turns a researcher's [Raindrop.io bookmarks](https://raindrop.io/) into a tamper-evident, cryptographically-verifiable web archive, with full-page WACZ preservation in [Browsertrix Cloud](https://webrecorder.net/browsertrix/) behind every saved URL. The researcher clicks "save" in the browser they already use; a preservation chain runs behind the scenes.

It builds on Simon Willison's [very 2020 pattern](https://simonwillison.net/tags/git-scraping/) using Github Actions as a scheduled runner.

---

#### How it works
A researcher clips a URL in Raindrop.io — the same bookmark manager they already use, or at least a very pleasant and fast browser extension. That's it from their perspective.

On schedule, a [GitHub Actions workflow](https://github.com/features/actions) pulls new bookmarks from the Raindrop API and writes each one as its own JSON file to a dedicated `bookmarks-data` git branch with some metadata, including the `accountId` of the researcher who saved it. The branch is append-only(-ish) and diffable: a versioned record of who saw what, and when.

Each new commit fires a second workflow that hands the URL to a Browsertrix Cloud account for a single-page crawl. The result is a hashed, replayable archive of the full page as it appeared at capture time, which lands in a per-project collection. The crawl ID is logged to `crawls.csv` on a separate `crawls-data` branch, acting as the join key between the bookmark and its archived form.

```
   Researcher clicks "save" in Raindrop.io
                       │
                       ▼
   ╭───────────────────────────────────╮
   │  ① bookmark JSON  (git branch)    │  who · when · tags
   ╰───────────────────┬───────────────╯
                       │  triggers a crawl
                       ▼
   ╭───────────────────────────────────╮
   │  ② crawls.csv row (git branch)    │  bookmarkId ↔ crawl_id
   ╰───────────────────┬───────────────╯
                       │  join key
                       ▼
   ╭───────────────────────────────────╮
   │  ③ WACZ artefact (Browsertrix)    │  full page, hashed
   ╰───────────────────────────────────╯

   Three artefacts. Three independent stores.
   One verifiable trail from click to capture.
```

Multi-account mode lets a team pool separate Raindrop libraries into a single shared corpus, each item tagged with its origin, and a small `projects.json` routes bookmarks to per-project Browsertrix collections so several investigations can run in parallel without cross-contamination. We gave the two researchers separate Raindrop accounts and can still attribute who requested which crawl.

---
### How it compares

✅ No servers ✅ No databases ✅ Per-researcher provenance ✅ Team-ready-ish

**The alternatives, in brief:**
- **Wayback Machine "Save Page Now" / Archive.today** — free and durable, but perhaps more awkward to organise by investigation, and you can't structure team workflows around them. The resulting files are hosted by the archives.
- **Screenshots, `wget`, SingleFile, monolith** — trivial to produce but more trivial to dispute, no chain of custody, "who saved this and when" lives in fragile filesystem metadata
- **Hanzo, Pagefreezer & other enterprise web-preservation suites** — full-featured, but perhaps expensive, proprietary, and built for corporate compliance rather than investigative journalism
- **Browsertrix Cloud on its own** — excellent crawler; you still have to feed it URLs by hand.

---

#### Who is it for?

Investigative journalists · OSINT researchers · Human rights documenters · Cross-border reporting teams · Litigation support investigators · Any team running a long-form investigation built on web sources

---

#### Status

This project is in pilot deployment with [Airwars on cross-border investigation into the apparent smuggling of luxury cars from Europe to Russia](https://dispatch.starlinglab.org/p/pilot-project-on-making-web-preservation) — it preserved **more than 9,000 unique URLs totalling 98 GiB**, including a six-week recurring crawl of a Belarus–Lithuania border webcam (~3,800 captures) that turned a self-overwriting page into a preserved time series.

---

**Stay informed**

Reach out to `<hi@digitalevidencetoolkit.org>` or subscribe to our newsletter:

<iframe src="https://digitalevidencetoolkit.substack.com/embed" width="100%" height="320" style="border:0px solid #EEE; background:white;" frameborder="0" scrolling="no"></iframe>
