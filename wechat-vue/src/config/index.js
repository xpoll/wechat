export default {
  getTime(str) {
    if (str == null || str == '' || str == 'undefined') return ''
    return '发布于: ' + str.replace('T', ' ').split('.')[0]
  }
}