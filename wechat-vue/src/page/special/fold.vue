<template>
  <div class="accordion">
    <div class="item">
      <img src="../../assets/sp/fold/Location-Pin.png"/>
      <h3>Location</h3>
    </div>
    <p style="display: block;">t is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using</p>
    <div class="item">
      <img src="../../assets/sp/fold/Headphones.png"/>
      <h3>Music</h3>
    </div>
    <p style="display: none;">t is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using</p>
    <div class="item">
      <img src="../../assets/sp/fold/Lightbulb.png"/>
      <h3>Notes</h3>
    </div>
    <p style="display: none;">t is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using</p>
    <div class="item">
      <img src="../../assets/sp/fold/Bookmarks.png"/>
      <h3>Books</h3>
    </div>
    <p style="display: none;">t is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using</p>
    <div class="item">
      <img src="../../assets/sp/fold/Lightning-Bolt.png"/>
      <h3>Tendances</h3>
    </div>
    <p style="display: none;">t is a long established fact that a reader will be distracted by the readable content of a page when looking at its layout. The point of using Lorem Ipsum is that it has a more-or-less normal distribution of letters, as opposed to using</p>
  </div>
</template>

<style type="text/css" lang="scss">
body {
  background: #f6704b;
}

* {
  margin: 0;
  padding: 0;
}

.accordion {
  margin: 50px auto;
  width: 380px;
  background: #ccc;
  cursor: pointer;
}
.accordion .item {
  height: 100px;
}
.accordion .item h3 {
  display: inline-block;
  vertical-align: middle;
  height: 100%;
  padding-left: 50px;
  font-family: "JF Flat Regular";
  font-size: 20px;
  font-weight: 400;
}
.accordion .item img {
  padding-left: 15px;
  width: 30px;
  vertical-align: middle;
}
.accordion .item h3:before {
  content: "";
  display: inline-block;
  vertical-align: middle;
  height: 100%;
}
.accordion .item:first-of-type {
  background: #620808;
  color: #f4ce74;
}
.accordion .item:nth-of-type(2) {
  background: #a53f3f;
  color: #ffe9c1;
}
.accordion .item:nth-of-type(3) {
  background: #f4ce74;
  color: #620808;
}
.accordion .item:nth-of-type(4) {
  background: #ffe9c1;
  color: #d5441c;
}
.accordion .item:last-of-type {
  background: #d5441c;
  color: #ffe9c1;
}
.accordion p {
  font-family: "JF Flat Regular";
  font-size: 18px;
  font-weight: 400;
  padding: 15px;
  display: none;
  box-shadow: inset 0 3px 7px rgba(0, 0, 0, 0.2);
}
.accordion p:first-of-type {
  background: #620808;
  color: #f4ce74;
}
.accordion p:nth-of-type(2) {
  background: #a53f3f;
  color: #ffe9c1;
}
.accordion p:nth-of-type(3) {
  background: #f4ce74;
  color: #620808;
}
.accordion p:nth-of-type(4) {
  background: #ffe9c1;
  color: #d5441c;
}
.accordion p:last-of-type {
  background: #d5441c;
  color: #ffe9c1;
}
</style>

<script type="text/javascript">
export default {
  // mounted() {
    // $('.item').on("click", function () {
    //   $(this).next().slideToggle(100);
    //   $('p').not($(this).next()).slideUp('fast');
    // });
  // }
}
</script>
