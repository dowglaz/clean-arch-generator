const configs = require('./configs');

const gulp = require('gulp');
const mustache = require('gulp-mustache');
const rename = require('gulp-rename');
const clean = require('gulp-clean');

const processables = `${configs.application.src}/${configs.application.processables}`;

const compile = async () => (
    gulp.src(processables)
        .pipe(mustache(configs, {}, {}))
        .pipe(rename((path) => path.extname = ''))
        .pipe(gulp.dest(configs.application.dist))
);

exports.compile = compile;

const everything = `${configs.application.src}/*`;
const copy = async () => ( gulp.src([everything, `!${processables}`]).pipe(gulp.dest(configs.application.dist)) );

exports.clean = async () => ( gulp.src(configs.application.dist, {read: false}).pipe(clean()) );

exports.default = exports.generate = async () => {
    await clean();
    await compile();
    await copy();
};
