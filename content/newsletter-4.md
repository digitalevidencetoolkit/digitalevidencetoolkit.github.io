---
title: 'Newsletter #4: Time(stamped), Time(lapsed)'
description: Dealing with metadata and timestamping with an immutable ledger
author: 'Basile Simon'
date: 2021-08-12
include_footer: true
---

Time. Dates. Data points in the legal battle over the value of pieces of evidence. But are they really this hard, indisputable and demonstrable?

Metadata is supposed to _describe_ a digital medium – the word comes from _meta: “referring to itself, or to something of its own type,”_ reads the Cambridge Dictionary. Think of the date at which a picture was taken, the model of scanner used to digitise a piece of paper, a location somewhere on the planet added by the uploader of a video, as well as its description...

But while we're only at the beginning of media fudgery (see audio and video “deep fakes”, which are computationally expensive), editing metadata is often only a few clicks away and not well protected.

The Digital Evidence Preservation Toolkit places metadata at its core, and answers the question: what did a piece of evidence look like at a particular time? **Both the content and the timestamp of record are cryptographically set in stone**, so to speak.

During international prosecution efforts, there is often a **considerable amount of time** between the date of the alleged crimes and the trial of the accused. [This period of time between crime and conviction](https://www.ejiltalk.org/part-i-what-can-be-done-about-the-length-of-proceedings-at-the-icc/) has amounted to 12 years in the Sierra Leone Tribunal, 24 years in the International Criminal Tribunal for the former Yugoslavia (ICTY), and 30 years in the Nyiramasuhuko et al trial (encompassing the trials, convictions, and appeals process).

**With the Toolkit, I can claim “I recorded this information at this date” and I can prove that what I am showing you today is identical to what was recorded at the time.**

---

### **Open Source Information**

**Digital media collected from online platforms** is one kind of the digital, open source evidence types that have begun to play an increasingly large role in recent ad hoc tribunals.

In early cases such as Prosecutor v. Karemera (2012) and Prosecutor v. Bagosora (2008) video evidence pertaining to the crimes of the accused were corroborated by so-called “external indicators” [in the form of transcripts and witness testimony.](https://journals.sas.ac.uk/deeslr/article/view/2130) **In the absence of internal indicators, such as timestamps and other forms of metadata,** prosecution efforts have successfully relied on external indicators, such as testimony or source identity information, to authenticate digital evidence. For instance, in the case against Karemara, transcripts of radio broadcasts were used [to authenticate the date of a video that did not contain timestamped metadata.](https://journals.sas.ac.uk/deeslr/article/view/2130)

### **Prosecutor v. Bemba**

The trial of Jean-Pierre Bemba Bongo (2015) set an **important precedent for proper digital evidence collection** following its intense scrutiny by the Defence team. The Prosecution submitted screenshots of Facebook photos alleged to show two corrupted witnesses together as indirect evidence of witness tampering, and while the screenshots alone were not evidence of the accusation, taken together with documents detailing a wire transfer from Bemba’s sister to one of witnesses depicted in the screenshot indicated [**the screenshots had the potential to gain probative value**](https://www.yalelawjournal.org/forum/open-source-evidence-on-trial).

In response to this submission of evidence, the Defence contended that the screenshots should not be given any consideration because [“it is impossible to know who posted the photos, when they were taken, where they were taken, who took them, or even if the people in the photos are who the prosecution claims they are.”](https://www.yalelawjournal.org/forum/open-source-evidence-on-trial) Moreover, the Defence also criticised the Prosecution’s **crude extraction of the photos from Facebook in the form of screenshots, devoid of any metadata that could determine important qualities such as time, geographic location, or author.**

In the case of Prosecutor v. Bemba, **the ICC ruling did not directly address the admissibility or probative value of the Facebook photos** because the relationship between the two individuals was further substantiated by the introduction of witness testimony. \***\*But the dispute over the authenticity of these Facebook screenshots **highlights the importance of best practice when collecting digital evidence\*\*. In subsequent trials, such as the case against Ahmad Al-Faqi Al-Mahdi, having learned from the Defence’s trivialisation of open source evidence during Bemba, [the Prosecution took preemptive steps](https://lup.lub.lu.se/student-papers/search/publication/9048327) to geolocate videos “depicting the accused engaged in destroying mosques, overseeing and ordering others to destroy mosques as well as explaining his intent to destroy mosques.” Through their efforts, they were able to [establish probable dates and locations](https://lup.lub.lu.se/student-papers/search/publication/9048327) of the incidents by identifying “multiple points of corroboration” seen in the videos.

The trial of Jean-Pierre Bemba Gombo is one of several instances (see [Karemara, Tolomir, Katanga and Ngudjolo Chui](https://lup.lub.lu.se/student-papers/search/publication/9048327)) when **ad hoc tribunals have demonstrated a relaxed attitude towards the admissibility of digital evidence**. In the absence of metadata such as timestamps, GPS location, or authorship/IP-addresses, digital evidence has often been tied to supplementary forms of evidence such as testimony, where the weight it holds is only as strong as the credibility of the evidence it is tied to.

---

## Then: trusted timestamps

Our challenge with the Toolkit is **to preserve a piece of evidence from the moment it reaches us.** We're dealing with after-the-fact research, as opposed to that coming straight from the field (see for example [EyeWitness](<[https://www.eyewitness.global/](https://www.eyewitness.global/)>), a star-project proposing an end-to-end, camera-to-courtroom workflow).

As I wrote before:

“**\*The Toolkit only addresses provenance and chain the custody from the moment of record.** The content stored very well may be unauthentic, doctored, or fake – but with the Toolkit, it will be adequately preserved.”\*

There are several implications in terms of metadata:

- In addition to **future-proof archives of webpages and screenshots**, we're capturing **some metadata** about pages and asking users about their potential needs beyond the obvious (think Google Analytics tracking codes, DNS records, etc.)
- This metadata is preserved and their unique signatures notarised in the **immutable ledger** we are using. This means that **once written in the database, there is no lossy change possible** aside from a complete deletion. Once again: we're addressing chain of custody _from the moment of record_ only.
- The centralised, Amazon Web Services-run ledger provides a hybrid method of [trusted timestamping](https://en.wikipedia.org/wiki/Trusted_timestamping) as per [ANSI ASC X9.95](https://en.wikipedia.org/wiki/ANSI_ASC_X9.95_Standard) and [ISO/IEC 18014](https://en.wikipedia.org/wiki/ISO/IEC_18014): each insertion in and revision of the ledger has a timestamp, er, _stamped_ on it by Amazon. It's a feature, not a bug – and a highly desirable one with that.

**We're now able to verifiably demonstrate appropriate custody of an archived webpage from a point in time which could not have been faked.**

More on authenticity and preservation of the files themselves later.

---

## Updates

We've had lots of excellent conversations and user interviews, notably with ECCHR, the Bureau of Investigative Journalism, the UN, Harvard, and Bellingcat.

The grant period ends in a couple of weeks and I'm now working on graphics, visuals and designs to share in future newsletter to better explain the choices and claims of the project.

I hope you'll stay tuned... don't hesitate to forward this email or share the newsletter!
